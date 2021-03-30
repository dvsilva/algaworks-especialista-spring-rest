# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 26-05-criando-o-bucket-de-producao-na-amazon-s3
git add .
git commit -m "Criando o bucket de produção na Amazon S3"
git push origin 26-05-criando-o-bucket-de-producao-na-amazon-s3

git checkout master
git merge --no-ff 26-05-criando-o-bucket-de-producao-na-amazon-s3
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```

configurar hosts

127.0.0.1       api.algafood.local
127.0.0.1       auth.algafood.local
127.0.0.1       www.algafood.local
127.0.0.1       www.matafome.local
127.0.0.1       www.foodanalytics.local

gerar encode (https://bcrypt-generator.com)
algafood-web - web123
foodanalytics - food123
faturamento - faturamento123