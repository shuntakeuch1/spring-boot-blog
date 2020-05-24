package net.shuntakeuch1.blog.controller

import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.RequestBuilder
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
class BaseControllerTest {

	@Autowired
	lateinit var context: WebApplicationContext

	lateinit var mockMvc: MockMvc

	@BeforeEach
	fun setup() {
		mockMvc = MockMvcBuilders
			.webAppContextSetup(context)
			.build()
	}

	protected fun perform(requestBuilder: RequestBuilder) {
		mockMvc.perform(requestBuilder)
			.andDo(MockMvcResultHandlers.print())
			.andExpect(status().isOk)
	}

}