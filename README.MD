[![](https://jitpack.io/v/topilov/lolzteam-kotlin-api.svg)](https://jitpack.io/#topilov/lolzteam-kotlin-api)

# Lolzteam-API

The *LolzApi* is an API that allows developers to interact with the *LolzTeam* forum site. The API provides endpoints for common forum operations such as retrieving user information, creating posts, and much more.

### API Base URL

The base URL for the *LolzApi* is https://api.zelenka.guru/

### Authentication

All API requests require authentication with an API token. The token can be obtained by logging in to the *Lolz* forum site and generating a token from the API settings page: https://zelenka.guru/account/api

### Usage

To use the *LolzApi* in your Kotlin project, you must first add the following dependency to your project's **build.gradle.kts** file:
```groovy
implementation("com.github.topilov:lolzteam-kotlin-api:1.0.7")
```

#### Default Request Example
```kotlin
fun main() = runBlocking { // Define main function, which is the entry point of the program
    val api = LolzApi(TOKEN) // Create an instance of the LolzApi class, passing in a TOKEN string
    val userResponse = api.getUser(USER_ID) // Call the getUser function to retrieve the user with the specified ID
    val username = userResponse.user?.username // Get the username from the GetUserResponse, or null if the user is not found
    println("your username is $username") // Print the username to the console
}
```

#### Batch Request Example
```kotlin
fun main() = runBlocking { // Define main function, which is the entry point of the program
    val api = LolzApi(TOKEN) // Create an instance of the LolzApi class, passing in a TOKEN string
    
    val userRequest = GetUserBatchRequest( // Create a GetUserBatchRequest object
        userId = USER_ID, // Specify the ID of the user to retrieve
    )
    
    val groupsRequest = GetUserGroupsBatchRequest( // Create a GetUserGroupsBatchRequest object
        userId = USER_ID // Specify the ID of the user to retrieve groups for
    )
    
    val batchResponse = api.executeForumBatch( // Execute the batch request and get the response
        listOf( // Pass a list of requests to execute in the batch
            userRequest, // Add the GetUserBatchRequest to the batch
            groupsRequest // Add the GetUserGroupsBatchRequest to the batch
        )
    )
    
    val userResponse = batchResponse.getJob<GetUserResponse>(userRequest.id) ?: return@runBlocking // Retrieve the response for the GetUserBatchRequest and convert it to a GetUserResponse object, or return if the response is null
    val username = userResponse.user?.username // Get the username from the GetUserResponse, or null if the user is not found
    
    val groupsResponse = batchResponse.getJob<GetUserGroupsResponse>(groupsRequest.id) ?: return@runBlocking // Retrieve the response for the GetUserGroupsBatchRequest and convert it to a GetUserGroupsResponse object, or return if the response is null
    val groups = groupsResponse.groups.size // Get the number of groups from the GetUserGroupsResponse
    
    println("your username is $username and you have $groups groups") // Print the username and number of groups to the console
}
```

#### More Examples
For more examples, please check the "example" category in the repository.
> Note that this examples should be run inside a coroutine, which can be started with runBlocking or CoroutineScope(Dispatchers.IO).launch {}, this is required for asynchronous code.

### Feedback and Development
The *LolzApi* is currently under development, and we welcome feedback from developers. If you have any questions, comments, or suggestions, please feel free to contact us at https://t.me/composabler

### Info
In terms of the market, we plan to add Market API. We also plan to provide comprehensive documentation and support resources to help users get up and running quickly and easily. 
