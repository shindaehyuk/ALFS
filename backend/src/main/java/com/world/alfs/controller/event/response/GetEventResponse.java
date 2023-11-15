package com.world.alfs.controller.event.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetEventResponse {
    private String title;
    private String case1;
    private String case2;

    @Builder
    public GetEventResponse(String title, String case1, String case2) {
        this.title = title;
        this.case1 = case1;
        this.case2 = case2;
    }
}
