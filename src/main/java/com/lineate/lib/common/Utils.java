package com.lineate.lib.common;

import com.lineate.lib.dto.response.ClientResponse;
import com.lineate.lib.dto.response.PresentationResponse;
import com.lineate.lib.dto.response.VoteResponse;
import com.lineate.lib.entity.Client;
import com.lineate.lib.entity.Presentation;
import com.lineate.lib.entity.Vote;

import java.time.ZonedDateTime;

public class Utils {

    public static ClientResponse convertClientToResponse(Client client) {
        return ClientResponse.builder()
                .id(client.getId())
                .firstName(client.getFirstName())
                .lastName(client.getLastName())
                .login(client.getLogin())
                .build();
    }

    public static PresentationResponse convertPresentationToResponse(Presentation presentation) {
        ZonedDateTime startTime = presentation.getStartTime();
        return PresentationResponse.builder()
                .id(presentation.getId())
                .name(presentation.getName())
                .description(presentation.getDescription())
                .status(presentation.getStatus().name())
                .creationTime(presentation.getCreationTime().toString())
                .startTime(startTime == null ? "" : startTime.toString())
                .authorLogin(presentation.getClient().getLogin())
                .build();
    }

    public static VoteResponse convertVoteToResponse(Vote vote) {
        return VoteResponse.builder()
                .id(vote.getId())
                .voteStatus(vote.getVoteStatus().name())
                .voteTime(vote.getVoteTime().toString())
                .clientLogin(vote.getClient().getLogin())
                .presentationName(vote.getPresentation().getName())
                .build();
    }
}