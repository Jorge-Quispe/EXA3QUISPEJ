package com.edu.EXAQUISPEJBACK.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.EXAQUISPEJBACK.Dao.LibroDao;
import com.edu.EXAQUISPEJBACK.Service.LibroService;
import com.edu.EXAQUISPEJBACK.entity.Libro;


@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao librodao;
		@Override
		public List<Libro> readAll() {
			// TODO Auto-generated method stub
			return librodao.readAll();
		}
}
