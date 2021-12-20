

function Content(){
    return(
        <div>
            <hr />
            <h2>도서 정보</h2>
            <table border='1'>
                <tr>
                    <th>도서제목</th>
                    <th>저자</th>
                    <th>발행일</th>
                    <th>가격</th>
                    <th>출판사</th>
                </tr>
                <tr>
                    <td>JavaScript</td>
                    <td>홍길동</td>
                    <td>2021-10-01</td>
                    <td>20000</td>
                    <td>서울출판사</td>
                </tr>
                <tr>
                    <td>HTML/CSS</td>
                    <td>이몽룡</td>
                    <td>2021-11-21</td>
                    <td>28000</td>
                    <td>강남출판사</td>
                </tr>
                <tr>
                    <td>React따라하기</td>
                    <td>성춘향</td>
                    <td>2019-10-01</td>
                    <td>30000</td>
                    <td>도서출판 강남</td>
                </tr>

            </table>
            
        </div>
    )
}

export default Content