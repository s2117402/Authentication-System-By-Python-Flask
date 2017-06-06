from flask import Flask, request
import query
import registeration
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'hello world'

@app.route('/authenticate', methods=['POST'])
def authenticate():
    print request.headers
    # print request.form
    print request.form.get('name')
    print request.form['password']
    # print request.form.getlist('name')
    # print request.form.get('nickname', default='little apple')
    num1=request.form.get('name')
    num2=request.form.get('password')
    username = str(num1.encode("ascii"))
    realpassword = str(num2.encode("ascii"))
    return str(query.authentication(username,realpassword))

@app.route('/register', methods=['POST'])
def register():
    print request.headers
    # print request.form
    print request.form.get('name')
    print request.form['password']
    # print request.form.getlist('name')
    # print request.form.get('nickname', default='little apple')
    num1=request.form.get('name')
    num2=request.form.get('password')
    username = str(num1.encode("ascii"))
    realpassword = str(num2.encode("ascii"))
    return str(registeration.createaccount(username, realpassword))

if __name__ == '__main__':
    app.run(debug=True)