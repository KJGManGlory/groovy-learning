class ForInTest {
    static void main(String[] args) {
        int[] array = [10, 20, 30, 40, 50]
        for (i in array) {
            print(i)
        }

        for (i in 10..15) {
            print(i)
        }

        for (i in 10..<15) {
            print(i)
        }

        // 遍历 map
        def employee = ["Ken" : 21, "John" : 25, "Sally" : 22]

        for(emp in employee) {
            print(emp)
        }
    }
}
