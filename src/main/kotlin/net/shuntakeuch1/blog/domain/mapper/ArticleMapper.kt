package net.shuntakeuch1.blog.domain.mapper

import net.shuntakeuch1.blog.domain.Article
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Select

@Mapper
interface ArticleMapper {
	@Insert(
		"""
		INSERT INTO articles (title, body) VALUES( #{title}, #{body})
		"""
	)
	fun insert(article: Article): Int

	@Select(
		"""
		SELECT id, title, body, created_at, modified_at  FROM articles
		"""
	)
	@ResultMap("list")
	fun findAll(): List<Article>
}
