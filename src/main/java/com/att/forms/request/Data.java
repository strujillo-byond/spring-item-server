package com.att.forms.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Data {
    private String idTemplate;
    private Long idItemServer;
    private String key;
    private String flavor;
    private String name;
    private String description;
    private Boolean status;
    private String nics;
    private String volumes;
}
