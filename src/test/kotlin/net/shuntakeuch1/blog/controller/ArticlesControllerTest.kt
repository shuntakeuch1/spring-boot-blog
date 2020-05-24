package net.shuntakeuch1.blog.controller

import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post

class ArticlesControllerTest:BaseControllerTest() {

	@Test
	fun index_200() {
		perform(get("/v1/articles"))
	}

	@Test
	fun post_200() {
		perform(post("/v1/articles"))
	}
}