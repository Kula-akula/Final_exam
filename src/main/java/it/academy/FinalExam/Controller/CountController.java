package it.academy.FinalExam.Controller;

import it.academy.FinalExam.Entity.GetCount;
import it.academy.FinalExam.Entity.PostCount;
import it.academy.FinalExam.Service.GetCountService;
import it.academy.FinalExam.Service.PostCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/counter")
public class CountController {
    @Autowired
    private GetCountService getCountService;

    @Autowired
    private PostCountService postCountService;

    @PostMapping
    public PostCount post(@RequestBody PostCount postCount){
        return postCountService.save(postCount);
    }

    @GetMapping
    public List<PostCount> getPostCounts(){
        return getCountService.getPostCounts();
    }

}
