package xhMVC.Data;

import java.util.List;

import xhMVC.Spittle;

public interface SpittleRepository {
	
	List<Spittle> findSpittles(long max,int count);

}
