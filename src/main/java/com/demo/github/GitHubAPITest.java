package com.demo.github;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GitHubAPITest {
  private static final String authorization = "Bearer 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";
  private static final String baseUrl = "https://api.github.com/search/code?q=user%3AAgus-DC+flask&type=code";
  // "issues?q=tasks+label:bug+language:python+user:Agus-DC+repo:AppDB+state:open&sort=created&order=asc";
  //"https://api.github.com/repos/Agus-DC/";
  //?q=user%3AAgus-DC+flask&type=code

  public GitHubAPITest() throws IOException, InterruptedException {
    System.out.println("Hola repo: " + this.get("AppDB"));

  }

  public String get(String path) throws IOException, InterruptedException {
    var request = HttpRequest.newBuilder().uri(URI.create(baseUrl))
        .setHeader("Authorization", authorization)
        .setHeader("Accept", "application/vnd.github.v3.text-match+json")
        .GET()
        .build();

    var response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();
  }
}
