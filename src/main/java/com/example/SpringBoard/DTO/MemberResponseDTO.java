package com.example.SpringBoard.DTO;

import com.example.SpringBoard.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponseDTO {
    private final String name;
    private final String gender;
    private final String phoneNumber;
    private final String address;

    public MemberResponseDTO(String name, String gender, String phoneNumber, String address) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public MemberResponseDTO(Member member) {
        this.name = member.getName();
        this.gender = member.getGender();
        this.phoneNumber = member.getPhoneNumber();
        this.address = member.getAddress();
    }


}