package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@TableName("tb_item_cat")
public class ItemCat extends BasePojo{
	

	private static final long serialVersionUID = -613633318135997881L;
	@TableId(type=IdType.AUTO)
	private Long id;
	private Long parent_id;
	private String name;
	private Integer status;
	private Integer sort_order;
	private Boolean isParent;
	
	
	

	

}
