package net.shuntakeuch1.blog.controller

import org.junit.jupiter.api.Test
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.transaction.annotation.Transactional

@Transactional
class ArticlesControllerTest : BaseControllerTest() {

	@Test
	@Sql("classpath:sql/list_article.sql")
	fun list_200() {
		val expect = arrayOf(
			object {
				val id = 1
				val title = "今日も"
				val body = "元気に"
			}
		)

		perform(get("/v1/articles"), expect)
	}

	@Test
	fun post_200() {
		val expect = object {}
		perform(post("/v1/articles"), expect)
	}
}