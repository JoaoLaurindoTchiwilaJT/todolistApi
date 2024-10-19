package ao.com.desafio_todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.com.desafio_todo_list.entity.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long>{
    
}
