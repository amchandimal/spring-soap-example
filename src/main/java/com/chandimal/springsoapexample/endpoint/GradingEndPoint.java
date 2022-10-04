package com.chandimal.springsoapexample.endpoint;

import com.chandimal.springsoapexample.dtos.marks.GetMarksRequest;
import com.chandimal.springsoapexample.dtos.marks.GetMarksResponse;
import com.chandimal.springsoapexample.service.StudentService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GradingEndPoint {

  private static final String NAMESPACE = "http://springsoapexample.chandimal.com/dtos/marks";

  private final StudentService studentService;

  public GradingEndPoint(StudentService studentService) {
    this.studentService = studentService;
  }

  @PayloadRoot(localPart = "getMarksRequest", namespace = NAMESPACE)
  @ResponsePayload
  public GetMarksResponse getMarksResponse(@RequestPayload GetMarksRequest request){
    return studentService.getMarksResponse(request);
  }
}
