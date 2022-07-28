package controller;

import request.HelloRequest;
import response.HelloResponse;
import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import request.HelloRequest;
import response.HelloResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getHello(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        ArrayList<HelloResponse> helloResp = new ArrayList<>();

        helloResp.add(new HelloResponse("Hello World, Budi","id1"));
        helloResp.add(new HelloResponse("Hello World, Andi","id2"));

        res.put("code", "200");
        res.put("message", "success");
        res.put("data", helloResp);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @PostMapping("/hello")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> addUser(@RequestBody HelloRequest reqHello){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        HelloResponse helloResp = new HelloResponse();

        helloResp.setId("1");
        helloResp.setName(reqHello.getName());

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", helloResp);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @PutMapping("/hello")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> editUser(@RequestBody HelloRequest reqHello){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        HelloResponse helloResp = new HelloResponse();

        helloResp.setId("1");
        helloResp.setName(reqHello.getName());

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", helloResp);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @DeleteMapping("/hello")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> deleteHello(String Id){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", "Hello world deleted");

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }
}
