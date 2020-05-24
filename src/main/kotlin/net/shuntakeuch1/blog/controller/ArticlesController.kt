package net.shuntakeuch1.blog.controller

import net.shuntakeuch1.blog.domain.Article
import net.shuntakeuch1.blog.domain.mapper.ArticleMapper
import org.springframework.web.bind.annotation.*

@RestController
class ArticlesController(private val articleMapper: ArticleMapper) {

	@GetMapping("/v1/articles")
	fun list(): List<Article> {
		return articleMapper.findAll()
	}

	@GetMapping("/v1/articles/{id}")
	fun get() = "記事取得"

	@PostMapping("/v1/articles")
	fun create(): Article {
		val article = Article()
		article.title = "初めてのブログ"
		article.body = "Spring Boot 書くの疲れる"
		articleMapper.insert(article)
		return article
	}

	@PutMapping("/v1/articles/{id}")
	fun update() = "記事更新"

	@DeleteMapping("/v1/articles/{id}")
	fun delete() = "記事削除"
}
