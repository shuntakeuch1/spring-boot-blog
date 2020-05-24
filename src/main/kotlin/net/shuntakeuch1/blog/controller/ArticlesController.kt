package net.shuntakeuch1.blog.controller

import org.springframework.web.bind.annotation.*

@RestController
class ArticlesController {

	@GetMapping("/v1/articles")
	fun index() = "記事一覧"

	@GetMapping("/v1/articles/{id}")
	fun get() = "記事取得"

	@PostMapping("/v1/articles/{id}")
	fun create() = "記事作成"

	@PutMapping("/v1/articles/{id}")
	fun update() = "記事更新"

	@DeleteMapping("/v1/articles/{id}")
	fun delete() = "記事削除"
}
