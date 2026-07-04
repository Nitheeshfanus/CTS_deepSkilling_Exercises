package orm_learn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import orm_learn.model.State;


@Repository
public interface StateRepository 
        extends JpaRepository<State,Integer> {


}