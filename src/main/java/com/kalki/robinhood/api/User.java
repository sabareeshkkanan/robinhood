package com.kalki.robinhood.api;

import com.kalki.robinhood.models.BasicInfo;
import com.kalki.robinhood.models.InvestmentProfile;
import com.kalki.robinhood.models.UserId;
import com.kalki.robinhood.models.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {
    @GetMapping("/")
    public UserInfo getUser() {
        return new UserInfo();
    }

    @GetMapping("/id/")
    public UserId getUserId() {
        return new UserId();
    }

    @GetMapping("/basic_info/")
    public BasicInfo getBasicInfo() {
        return new BasicInfo();
    }

    @GetMapping("/investment_profile/")
    public InvestmentProfile getInvestmentProfile() {
        return new InvestmentProfile();
    }

}
