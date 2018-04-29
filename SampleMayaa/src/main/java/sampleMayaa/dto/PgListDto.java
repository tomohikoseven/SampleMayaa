package sampleMayaa.dto;

import java.util.List;
import sampleMayaa.entity.PgLangEntity;

public class PgListDto {
	private List<PgLangEntity> list;

	public List<PgLangEntity> getList(){
		return this.list;
	}
	public void setList( List<PgLangEntity> list ){
		this.list = list;
	}
}
