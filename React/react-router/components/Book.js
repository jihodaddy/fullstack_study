import {useParams} from 'react-router-dom'

const data = {
    java: {
        title: 'JavaScript',
        author: '홍길동',
        date: '2021-10-01',
        price: 20000,
        publish: '서울출판사'
    },
    html: {
        title: 'HTML/CSS',
        author: '이몽룡',
        date: '2021-11-21',
        price: 28000,
        publish: '강남출판사'
    },
    react: {
        title: 'React따라하기',
        author: '성춘향',
        date: '2019-10-01',
        price: 30000,
        publish: '도서출판 강남'
    }
}

function Book(){
    const params = useParams();
    const book = data[params.keyword];

    if(!book){
        return <div><hr/><div>도서 정보가 없습니다.</div></div>
    }

    return (
        <div>
            <hr />
            <h3>
                {params.keyword} : {book.title}
            </h3>
            <p>저자: {book.author} </p>  
            <p>발행일: {book.date}</p>
            <p>가격: {book.price}</p>
            <p>출판사: {book.publish}</p>
        </div>
    )

}

export default Book