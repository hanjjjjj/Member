package com.its.board.controller;

import com.its.board.dto.CommentDTO;
import com.its.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    //댓글 등록
    @PostMapping("/save")
    public @ResponseBody List<CommentDTO>save(@ModelAttribute CommentDTO commentDTO){
        System.out.println("commentDTO = "+ commentDTO );
        commentService.save(commentDTO); //1.
        List<CommentDTO>commentDTOList=commentService.findAll(commentDTO.getBoardId()); //2.
        return commentDTOList;
    }
}
