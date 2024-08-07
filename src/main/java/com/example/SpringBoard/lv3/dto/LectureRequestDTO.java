package com.example.SpringBoard.lv3.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class LectureRequestDTO {
    @NotBlank(message = "제목을 입력하세요")
    private String title;
    @NotNull(message = "제목을 입력하세요")
    private int price;
    @NotBlank(message = "제목을 입력하세요")
    private String introduction;
    @NotBlank(message = "제목을 입력하세요")
    private String category;
    @NotNull(message = "제목을 입력하세요")
    private int teacher_id;
}
