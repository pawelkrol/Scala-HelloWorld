import org.scalatest.FunSpec

import com.github.pawelkrol.HelloWorld.Message

class MessageSpec extends FunSpec {

  describe("message") {
    it("returns hello world string") {
      assert(Message.hello("World") == "Hello World!")
    }
  }
}
