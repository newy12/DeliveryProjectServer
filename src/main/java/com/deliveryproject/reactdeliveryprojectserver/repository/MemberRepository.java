package com.deliveryproject.reactdeliveryprojectserver.repository;

import com.deliveryproject.reactdeliveryprojectserver.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
