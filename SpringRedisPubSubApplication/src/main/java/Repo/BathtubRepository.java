package Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bathtub;;

@Repository
public interface BathtubRepository extends CrudRepository<Bathtub, String>{}