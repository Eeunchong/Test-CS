package com.example.career.domain.user.Service;

import com.example.career.domain.user.Dto.MentorHomeRespDto;
import com.example.career.domain.user.Dto.UserReqDto;
import com.example.career.domain.user.Dto.SignUpReqDto;
import com.example.career.domain.user.Entity.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserService {
    public User signIn(UserReqDto userReqDto);
//    public User signUp(SignUpReqDto signUpReqDto);
    @Transactional
    public SignUpReqDto signup(SignUpReqDto userDto);
    public boolean validUsername(String username);
    public boolean validNickname(String nickname);
    public boolean validTelephone(String telephone);
    public MentorHomeRespDto mentorHome();
    @Transactional(readOnly = true)
    public SignUpReqDto getUserWithAuthorities(String username);
    @Transactional(readOnly = true)
    public SignUpReqDto getMyUserWithAuthorities();
    public String uploadProfile(MultipartFile multipartFile) throws IOException;
    public List<String> uploadActiceImages(List<MultipartFile> MultipartFile) throws IOException;
}
