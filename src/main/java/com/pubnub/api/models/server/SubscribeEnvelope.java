package com.pubnub.api.models.server;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class SubscribeEnvelope {

    @JsonProperty("m")
    private List<SubscribeMessage> messages;

    @JsonProperty("t")
    private SubscribeMetadata metadata;

}
