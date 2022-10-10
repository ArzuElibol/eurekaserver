package com.siber.bookclient;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.siber.bookclient.Model.Book;

@RestController
public class BookController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/books")
    public List<Book> handleRequest(Model model) {
        List<ServiceInstance> instances = discoveryClient.getInstances("Book-Service");
       
       List<Book> result =null;
        if (instances != null && !instances.isEmpty()) { 
            ServiceInstance serviceInstance = instances.get(0);
            String url = serviceInstance.getUri().toString();
       

            url = url + "/list";
  RestTemplate restTemplate = new RestTemplate();
               result = restTemplate.getForObject(url, List.class);
        

            System.out.println(result);

        }

        return result ;
    }

}

//     public List<Book> handleRequest(Model model) {
//         List<Book> result =null;
//         List<ServiceInstance> instances = discoveryClient.getInstances("Book-Service");
//         if (instances != null && !instances.isEmpty()) {
//             ServiceInstance serviceInstance = instances.get(0);
//             String url = serviceInstance.getUri().toString();
//             url = url + "/list";
//             RestTemplate restTemplate = new RestTemplate();
//             result = restTemplate.getForObject(url, List.class);
// System.out.println(result);
//             // model.addAttribute("result", result);
//         }

//         return result;
//     }

// }


