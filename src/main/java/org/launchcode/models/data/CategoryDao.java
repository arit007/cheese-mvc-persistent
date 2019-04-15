package org.launchcode.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Locale.Category;

@Repository
@Transactional
public interface CategoryDao extends CrudRepository <Category, Integer> {
}
