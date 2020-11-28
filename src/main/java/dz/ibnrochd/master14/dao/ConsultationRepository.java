package dz.ibnrochd.master14.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Consultation;




@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
	List<Consultation> findById(int Id);
}
