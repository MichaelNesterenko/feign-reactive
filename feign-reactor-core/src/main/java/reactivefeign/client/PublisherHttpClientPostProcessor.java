package reactivefeign.client;

import java.util.function.Function;

import reactivefeign.publisher.PublisherHttpClient;

public interface PublisherHttpClientPostProcessor
	extends Function<PublisherHttpClient, PublisherHttpClient> {
}