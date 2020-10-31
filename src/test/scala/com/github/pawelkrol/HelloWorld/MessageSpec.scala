import org.scalatest.funspec.AnyFunSpec

import com.github.pawelkrol.HelloWorld.Message

class MessageSpec extends AnyFunSpec {

  describe("message") {
    it("returns hello world string") {
      assert(Message.hello("World") == "Hello World!")
    }
  }
}
