package com.github.dempey.pioneer.service;

import com.github.dempey.pioneer.model.Demographic;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service("walkerService")
public class WalkerServiceImpl implements WalkerService {

    @Override
    public Demographic getAccountInfo(Integer id) {
        Demographic accountInfo = new Demographic();

        LocalDate localDate = LocalDate.of(2017, 7,18);
        Date sqlDate = Date.valueOf(localDate);
        accountInfo.setBirthDate(sqlDate);

        accountInfo.setStreetAddress("875 West 300 South");
        accountInfo.setZipCode(84037L);
        accountInfo.setCity("Kaysville");
        accountInfo.setState("UT");
        accountInfo.setFirstName("Jarod");
        accountInfo.setLastName("McLeod");
        accountInfo.setInterests("Bird watching, computer gaming, Texas barbecue, UFOs");
        accountInfo.setGender("M");

        return accountInfo;
    }
}
