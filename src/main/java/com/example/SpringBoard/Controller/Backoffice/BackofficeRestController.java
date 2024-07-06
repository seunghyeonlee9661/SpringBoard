package com.example.SpringBoard.Controller.Backoffice;


import com.example.SpringBoard.DTO.backoffice.LectureRequestDTO;
import com.example.SpringBoard.DTO.backoffice.LoginRequestDTO;
import com.example.SpringBoard.DTO.backoffice.SignupRequestDTO;
import com.example.SpringBoard.DTO.backoffice.TeacherRequestDTO;
import com.example.SpringBoard.entity.backoffice.Teacher;
import com.example.SpringBoard.service.BackofficeService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/backoffice/api")
public class BackofficeRestController {

    private final BackofficeService backofficeService;

    /* 사용자 추가 */
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignupRequestDTO signupRequestDTO) {
        return backofficeService.create(signupRequestDTO);
    }

    /* 로그인 */
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequestDTO, HttpServletResponse response) {
        return backofficeService.login(loginRequestDTO,response);
    }
    
    /* 강사 추가 */
    @PostMapping("/addTeacher")
    public ResponseEntity<String> create(@RequestBody TeacherRequestDTO teacherRequestDTO) {
        return backofficeService.create(teacherRequestDTO);
    }

    /* 강의 추가 */
    @PostMapping("/addLecture")
    public ResponseEntity<String> create(@RequestBody LectureRequestDTO lectureRequestDTO) {
        return backofficeService.create(lectureRequestDTO);
    }

    /* 강의 추가 */
    @PostMapping("/lecture")
    public ResponseEntity<String> addLecture(@RequestBody LectureRequestDTO lectureRequestDTO) {
        return backofficeService.create(lectureRequestDTO);
    }

    /* 강의 삭제 */
    @PostMapping("/lecture/{id}/delete")
    public ResponseEntity<String> deleteLecture(@PathVariable("id") Integer id) {
        return backofficeService.deleteLecture(id);
    }

    /* 강의 수정 */
    @PostMapping("/lecture/{id}/edit")
    public ResponseEntity<String> editLecture(@RequestBody LectureRequestDTO lectureRequestDTO,@PathVariable("id") Integer id) {
        return backofficeService.edit(id,lectureRequestDTO);
    }


    /* 강사 추가 */
    @PostMapping("/teacher")
    public ResponseEntity<String> addTeacher(@RequestBody LectureRequestDTO lectureRequestDTO) {
        return backofficeService.create(lectureRequestDTO);
    }

    /* 강사 삭제 */
    @PostMapping("/teacher/{id}/delete")
    public ResponseEntity<String> deleteTeacher(@PathVariable("id") Integer id) {
        return backofficeService.deleteTeacher(id);
    }

    /* 강의 수정 */
    @PostMapping("/teacher/{id}/edit")
    public ResponseEntity<String> editTeacher(@RequestBody TeacherRequestDTO teacherRequestDTO,@PathVariable("id") Integer id) {
        return backofficeService.edit(id,teacherRequestDTO);
    }

}
