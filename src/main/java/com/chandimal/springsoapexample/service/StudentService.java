package com.chandimal.springsoapexample.service;

import com.chandimal.springsoapexample.dtos.marks.GetMarksRequest;
import com.chandimal.springsoapexample.dtos.marks.GetMarksResponse;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  public GetMarksResponse getMarksResponse(GetMarksRequest getMarksRequest){
    GetMarksResponse getMarksResponse = new GetMarksResponse();
    if (getMarksRequest.getMarks() > 75){
      getMarksResponse.setGrade("A");
    }else if (getMarksRequest.getMarks() > 65){
      getMarksResponse.setGrade("B");
    }else if (getMarksRequest.getMarks() > 50){
      getMarksResponse.setGrade("C");
    }else {
      getMarksResponse.setGrade("D");
    }
    return getMarksResponse;
  }

}
