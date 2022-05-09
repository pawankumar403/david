package com.drm.up.repository;

import com.drm.up.entity.MachineInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineInfoRepo extends CrudRepository<MachineInfo, Integer> {
}
