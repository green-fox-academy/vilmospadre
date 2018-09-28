package com.greenfoxacademy.reddit.controllers;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PostController {

    private PostServiceImpl postService;

    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postService.findAllByOrderByScoreDesc());
        return "index";
    }

    @GetMapping("/submit")
    public String submitGet() {
        return "submit";
}

    @PostMapping("/submit")
    public String submitPost(String title, String url){
        postService.savePost(title, url);
        return "redirect:/";
    }

    @PostMapping("/voteup/{id}")
    public String upvote(@PathVariable long id) {
        postService.voteUp(id);
        return "redirect:/";
    }

    @PostMapping("/votedown/{id}")
    public String downvote(@PathVariable long id) {
        postService.voteDown(id);
        return "redirect:/";
    }

}
