# Facebook Messenger Model POJOs

The purpose of this repository is to provide a library for the different model objects required for the [Facebook Messenger Platform](https://developers.facebook.com/docs/messenger-platform).

These POJOs can be serialized or deserialized using [GSON](https://github.com/google/gson) or [Jackson JSON libraries](https://github.com/FasterXML/jackson).

## Building the code

The mvn POM file requires two parameters passed.

'''mvn clean install -Dproject.version=1.0.0 -Dbuild.number=$BUILD_NUMBER
'''

## Getting started

Add the most recent JAR to your project.

All objects are created using builders. The builders perform some validation, to ensure the JSON created will be accepted by the Facebook Messenger platform.

Here's an example for sending a simple message using JAX-RS and GSON.

'''private void sendMessage(Long recipientId, String textMessage) {
    // Get client and target for message
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target(FACEBOOK_URI)
            .queryParam("access_token", FACEBOOK_PAGE_ACCESS_TOKEN);

    // Build message for Facebook Messenger
    MessageRequestBuilder builder = new MessageRequestBuilder();
    builder.recipient(new RecipientBuilder()
                              .id(recipientId)
                              .build());
    builder.message(new MessageBuilder().text(textMessage).build());

    // Send message
    Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
    Gson gson = new Gson();
    String json = gson.toJson(builder.build());
    javax.ws.rs.core.Response response
            = invocationBuilder.post(Entity.entity(json, MediaType.APPLICATION_JSON));
}
'''

## Contributions

If you wish to contribute to any issues you find in the source code, please [issue a pull request](https://github.com/deege/fb-messenger-model/pulls).

You can also [create a new issue](https://github.com/deege/fb-messenger-model/issues) and submit it. Please include as much detail as you can for the issue.
