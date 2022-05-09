package com.drm.up.controller;

import com.drm.up.entity.LdapInfo;
import com.drm.up.service.LdapService;
import com.drm.up.vo.LdapInfoVO;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LdapController {
    @Autowired
    private LdapService ldapService;

    //Ldap users api
    @PostMapping("/get-ldap-users")
    public ResponseEntity<ObjectNode> getLdapUsers(@RequestBody LdapInfoVO ldapInfoVO) throws Exception {
        List<ObjectNode> userList = ldapService.getLdapUsers(ldapInfoVO);
        return new ResponseEntity(userList, HttpStatus.OK);
    }

    //Dropdown API
    @GetMapping("/get-ldap-servers-info")
    public ResponseEntity<ObjectNode> getLdapServersInfo() throws Exception {
        List<LdapInfo> ldapInfos = ldapService.getLdapServersInfo();
        return new ResponseEntity(ldapInfos, HttpStatus.OK);
    }


}
