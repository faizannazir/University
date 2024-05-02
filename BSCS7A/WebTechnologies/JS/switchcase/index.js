document.addEventListener('DOMContentLoaded',()=>
{
    const form = document.querySelector('form')
    form.onsubmit =  ()=>
{
    const value  = document.querySelector('#number').value
    const h1  = document.querySelector('#result')
    console.log(value);
    switch(true)
    {
        case value>90:
            h1.innerHTML="you got A grade"
        break;
        case value>80:
            h1.innerHTML="you got B grade"
        break;
        case value>70:
            h1.innerHTML="you got C grade"
        break;
        case value>60:
            h1.innerHTML="you got D grade"
        break;
        case value>50:
            h1.innerHTML="you got E grade"
        break;
        default:
            h1.innerHTML="you got F grade"
        break;
    }
    return false;
}
});

