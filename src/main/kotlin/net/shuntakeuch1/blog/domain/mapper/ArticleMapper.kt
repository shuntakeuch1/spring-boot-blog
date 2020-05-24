package net.shuntakeuch1.blog.domain.mapper

import net.shuntakeuch1.blog.domain.Article
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper

@Mapper
interface ArticleMapper {
	@Insert(
		"""
		INSERT INTO articles
		(title,body)
		VALUES
		(#{title},#{body})
	"""
	)
	fun insert(article: Article)
}
