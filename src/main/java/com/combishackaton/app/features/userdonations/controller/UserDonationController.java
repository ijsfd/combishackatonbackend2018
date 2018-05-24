package com.combishackaton.app.features.userdonations.controller;

import com.combishackaton.app.common.model.RestResponse;
import com.combishackaton.app.features.userdonations.entity.UserDonation;
import com.combishackaton.app.features.userdonations.service.UserDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user-donation")
public class UserDonationController {

    private UserDonationService userDonationService;

    @Autowired
    public UserDonationController(UserDonationService userDonationService) {
        this.userDonationService = userDonationService;
    }

    @GetMapping
    public RestResponse<List<UserDonation>> fetchAll() {
        return new RestResponse<List<UserDonation>>(true).setData(userDonationService.findAll());
    }


    @GetMapping("/{id}")
    public RestResponse<UserDonation> fetchOne(@PathVariable(name = "id") String id) {
        return new RestResponse<UserDonation>(true).setData(userDonationService.findOne(id));
    }

    @GetMapping("/user/{id})")
    public RestResponse<List<UserDonation>> fetchAll(@PathVariable(name = "id") String id) {
        return new RestResponse<List<UserDonation>>(true).setData(userDonationService.findAllByUser(id));
    }


}
