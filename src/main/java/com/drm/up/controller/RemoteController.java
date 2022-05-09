package com.drm.up.controller;

import com.drm.up.entity.MachineInfo;
import com.drm.up.service.RemoteService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class RemoteController {
    @Autowired
    private RemoteService remoteService;

    @GetMapping("/get-remote-machine-users-groups")
    public ResponseEntity<ObjectNode> getLdapUsers(@RequestParam("machineId") Integer machineId) throws Exception {
        Map<String, List<String>> usersGroups = remoteService.getRemoteUsersGroups(machineId);
        return new ResponseEntity(usersGroups, HttpStatus.OK);
    }

    @GetMapping("/get-remote-machines-list")
    public ResponseEntity<ObjectNode> getRemoteMachinesList() throws Exception {
        List<MachineInfo> machineInfos = remoteService.getRemoteMachinesList();
        return new ResponseEntity(machineInfos, HttpStatus.OK);
    }

}
