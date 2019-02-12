package com.stackroute.userservice.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
  //  @GeneratedValue
   private int UserId;
   // @ApiModelProperty(notes="name of track")
    private String Password;
   // @ApiModelProperty(notes = "comments on track")
   private String EmailId;
    private String UserName;
    private String Intrests;
    private String gender;



}
