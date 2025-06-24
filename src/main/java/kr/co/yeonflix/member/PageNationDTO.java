package kr.co.yeonflix.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PageNationDTO {
	
	private int pageNumber, currentPage, totalPage;
	private String url,  field, keyword;

}
