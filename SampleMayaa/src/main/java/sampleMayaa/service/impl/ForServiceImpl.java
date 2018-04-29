package sampleMayaa.service.impl;

import java.util.ArrayList;
import java.util.List;
import sampleMayaa.entity.PgLangEntity;
import sampleMayaa.service.ForService;
import sampleMayaa.dto.PgListDto;

public class ForServiceImpl implements ForService {
	public void createList( PgListDto pgListDto ) {
		PgListDto dto = new PgListDto();
		List<PgLangEntity> list = new ArrayList<PgLangEntity>();
		dto.setList( list  );

		PgLangEntity entity1 = new PgLangEntity();
		entity1.setName("C言語");
		entity1.setComment("古いが、信頼性は高い.");
		dto.getList().add(entity1);

		PgLangEntity entity2 = new PgLangEntity();
		entity2.setName("C++");
		entity2.setComment("うまく使えば強大な能力を発揮.");
		dto.getList().add(entity2);

		PgLangEntity entity3 = new PgLangEntity();
		entity3.setName("Perl");
		entity3.setComment("有用な時代もあったが、もうあまり使われていない.");
		dto.getList().add(entity3);

		pgListDto = dto;
		return;
	}
}
