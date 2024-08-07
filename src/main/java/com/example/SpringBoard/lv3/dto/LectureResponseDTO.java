package com.example.SpringBoard.lv3.dto;
import com.example.SpringBoard.lv3.entity.Lecture;
import com.example.SpringBoard.lv3.entity.Teacher;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class LectureResponseDTO {
    private int id;
    private String title;
    private int price;
    private String introduction;
    private String category;
    private SimpleTeacherDTO teacher;
    private LocalDateTime regist;

    public LectureResponseDTO(Lecture lecture){
        this.id = lecture.getId();
        this.title = lecture.getTitle();
        this.price = lecture.getPrice();
        this.introduction = lecture.getIntroduction();
        this.category = lecture.getCategory();
        this.teacher = new SimpleTeacherDTO(lecture.getTeacher());
        this.regist = lecture.getRegist();
    }
}
